grammar calc;

/*lexical analysis*/
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ; // match identifiers
INT : [0-9]+ ; // match integers
NEWLINE:'\r'? '\n' ;
WS : [ \r\t\u000C\n]+ -> skip ;
stat: expr NEWLINE EOF            # printExpr
        | ID '=' expr NEWLINE   # assign
        | NEWLINE               # blank
        ;
expr: expr op=('*'|'/') expr        # muldiv
        | expr op=('+'|'-') expr    # addsub
        | INT                       # int
        | ID                         # id
        | '(' expr ')'               # parens
        ;


