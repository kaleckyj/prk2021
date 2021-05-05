import java.util.HashMap;
import java.util.Map;

public class MyCalcVisitor extends CalcBaseVisitor<Integer> {
    /** "memory" for our calculator; variable/value pairs go here */
    Map<String, Integer> memory = new HashMap<String, Integer>();

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(CalcParser.AssignContext ctx) {
        String id = ctx.ID().getText();    // id is left-hand side of '='
        Integer value = visit(ctx.expr()); // compute value of expression on right
        memory.put(id, value);             // store it in our memory
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitExpression(CalcParser.ExpressionContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return -999;                       // return dummy value
    }

    /** INT */
    @Override
    public Integer visitInt(CalcParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

	@Override
    public Integer visitFloat(CalcParser.FloatContext ctx) {
        return Integer.valueOf(ctx.FLOAT().getText());
    }

    /** expr op=('*'|'/'|'%') expr */
    @Override
    public Integer visitMulDivMod(CalcParser.MulDivModContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case CalcParser.MUL:
                return left * right;
            case CalcParser.DIV:
                return left / right;
            case CalcParser.MOD:
                return left % right;
        }
        return -999;
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(CalcParser.AddSubContext ctx) {
        Integer left = visit(ctx.expr(0));
        Integer right = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case CalcParser.ADD:
                return left + right;
            case CalcParser.SUB:
                return left - right;
        }
        return -999;
    }

    @Override
    public Integer visitIncPre(CalcParser.IncPreContext ctx) {
        Integer num = visit(ctx.expr());
        switch (ctx.op.getType()) {
            case CalcParser.INC:
                return num++;
            case CalcParser.DEC:
                return num--;
        }
        return -999;
    }

    @Override
    public Integer visitIncPost(CalcParser.IncPostContext ctx) {
        Integer num = visit(ctx.expr());
        switch (ctx.op.getType()) {
            case CalcParser.INC:
                return num++;
            case CalcParser.DEC:
                return num--;
        }
        return -999;
    }

    /** '(' expr ')' */
    @Override
    public Integer visitParenth(CalcParser.ParenthContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitAbs(CalcParser.AbsContext ctx) {
        Integer num = visit(ctx.expr());
        return (int)Math.abs(num);
    }

	@Override
    public Integer visitRound(CalcParser.RoundContext ctx) {
        Integer num = visit(ctx.expr());
        return (int)Math.round(num);
    }

	@Override
    public Integer visitCeil(CalcParser.CeilContext ctx) {
        Integer num = visit(ctx.expr());
        return (int)Math.ceil(num);
    }

	@Override
    public Integer visitFloor(CalcParser.FloorContext ctx) {
        Integer num = visit(ctx.expr());
        return (int)Math.floor(num);
    }

}