// Generated from Calc.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

import java.util.Stack;
import java.util.ArrayList;

public class MyCalcListener extends CalcBaseListener {

	Stack<Num> stack = new Stack<>();
    ArrayList<Var> vars = new ArrayList<>();
	String assignTo;

    public Stack<Num> getStack(){
        return stack;
    }

	public Num getSameNumType(Num right, Num left) {
		Num ret;
        if (!right.isInt || !left.isInt) { ret = new Num((float)0); } else { ret = new Num((int)0); }
        return ret;
    }

    @Override
	public void exitMulDivMod(CalcParser.MulDivModContext ctx) {
        Num right = this.stack.pop();
        Num left = this.stack.pop();
		Num res = getSameNumType(right, left);
		switch (ctx.op.getType()) {
            case CalcParser.MUL:
                res.value = left.value * right.value;
				break;
            case CalcParser.DIV:
				res.value =  left.value / right.value;
				break;
            case CalcParser.MOD:
				res.value = left.value % right.value;
				break;
        }
        this.stack.push(res);
	}

	@Override
	public void exitAddSub(CalcParser.AddSubContext ctx) {
        Num right = this.stack.pop();
        Num left = this.stack.pop();
		Num res = getSameNumType(right, left);
		switch (ctx.op.getType()) {
            case CalcParser.ADD:
                res.value = left.value + right.value;
				break;
            case CalcParser.SUB:
                res.value = left.value - right.value;
				break;
        }
        this.stack.push(res);
	}

	@Override
	public void exitIncPre(CalcParser.IncPreContext ctx) {
		Num val = this.stack.pop();
        switch (ctx.op.getType()) {
            case CalcParser.INC:
				val.value++;
				break;
            case CalcParser.DEC:
				val.value--;
				break;
        }
        this.stack.push(val);
	}

	@Override
	public void exitIncPost(CalcParser.IncPostContext ctx) {
		Num val = this.stack.pop();
        switch (ctx.op.getType()) {
            case CalcParser.INC:
				val.value++;
				break;
            case CalcParser.DEC:
				val.value--;
				break;
        }
        this.stack.push(val);
	}

	@Override
	public void exitAbs(CalcParser.AbsContext ctx) {
		Num val = this.stack.pop();
        Num var = new Num((int)Math.abs(val.value));
        this.stack.push(var);
	}

	@Override
	public void exitCeil(CalcParser.CeilContext ctx) {
		Num val = this.stack.pop();
        Num var = new Num((int)Math.ceil(val.value));
        this.stack.push(var);
	}

	@Override
	public void exitFloor(CalcParser.FloorContext ctx) {
		Num val = this.stack.pop();
        Num var = new Num((int)Math.floor(val.value));
        this.stack.push(var);
	}

	@Override
	public void exitRound(CalcParser.RoundContext ctx) {
		Num val = this.stack.pop();
        Num var = new Num((int)Math.round(val.value));
        this.stack.push(var);
	}

	@Override
	public void exitFloat(CalcParser.FloatContext ctx) {
        float number = Float.parseFloat(ctx.getText().replace(",","."));
        this.stack.push(new Num(number));
	}

	@Override
	public void exitInt(CalcParser.IntContext ctx) {
        int number = Integer.parseInt(ctx.getText());
        this.stack.push(new Num(number));
	}



	@Override
	public void exitDecl(CalcParser.DeclContext ctx) {
		Num assigned = this.stack.pop();
		vars.add(new Var(ctx.getChild(1).getText(), assigned));
	}

	@Override
	public void enterAssignment(CalcParser.AssignmentContext ctx) {
		assignTo = ctx.getChild(0).getText();
	}

	@Override
	public void exitAssignment(CalcParser.AssignmentContext ctx) {
		for (Var var: vars) {
			if (var.name.equals(assignTo)) {
				var.num = this.stack.pop();
			}
		}
		assignTo = "";
	}

	@Override
	public void exitVariable(CalcParser.VariableContext ctx) {
		String name = new String(ctx.getText());
		boolean exists = false;
		for (Var var: vars) {
			if (var.name.equals(name)) {
				this.stack.push(var.num);
				exists = true;
				break;
			}
		}
		if (!exists) { System.err.println("Takova promenna neexistuje: " + name); }
	}

}