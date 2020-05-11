grammar calc;

/*lexical analysis*/
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^' ;

INT : [0-9]+ ; // match integers
NEWLINE:'\r'? '\n' ;
WS : [ \r\t\u000C]+ -> skip ;

stat: expr(NEWLINE|EOF)      # printExpr
       | NEWLINE                        # blank

        ;
expr:    expr '^' expr         # power
        | expr op=('*'|'/') expr        # muldiv
        | expr op=('+'|'-') expr    # addsub
        | INT                       # int
        | '(' expr ')'               # parens
        ;


