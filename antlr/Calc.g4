grammar Calc;

calc:	line*;
line:	expr NEWLINE                # expression
    |	decl NEWLINE                # declare
    |   NEWLINE                     # blank
    ;

var:	'int' | 'float';
decl:	var name '=' expr;
name:	ID;

expr:   expr op=('*'|'/'|'%') expr  # mulDivMod
    |   expr op=('+'|'-') expr      # addSub
    |   op=('++'|'--') expr         # incPre
    |   expr op=('++'|'--')         # incPost
    |	'abs(' expr ')'             # abs
    |   'ceil(' expr ')'            # ceil
    |   'floor(' expr ')'           # floor
    |   'round(' expr ')'           # round
    |   '('expr')'                  # parenth
    |   FLOAT                       # float
    |   INT                         # int
    |	name '=' expr               # assignment
    |	name                        # variable
    ;

MUL:    '*';
DIV:    '/';
MOD:    '%';
ADD:    '+';
SUB:    '-';
INC:    '++';
DEC:    '--';

WHITESPACE: (' ' | '\t') -> skip;
ID: [a-zA-Z]+;
INT: NUMBER+ ;
FLOAT: NUMBER+ (COMMA NUMBER+)? ;
NEWLINE: [\r\n]+ ;

fragment NUMBER: ('0' .. '9') ;
fragment COMMA: (',') ;
