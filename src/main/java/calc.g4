grammar calc;

/*lexical analysis*/
MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
POW : '^' ;
//ID : [a-zA-Z] ;
INT : [0-9]+ ;   //match Integers
FLOAT : INT ('.' INT)?;// match float
NEWLINE :'\r'? '\n' ;
BOOL : 'TRUE'|'FALSE';
WS : [ \r\t\u000C]+ -> skip ;

stat: expr(NEWLINE|EOF)      # printExpr
       | NEWLINE                        # blank

        ;
expr:    '-' expr                 #negative
        | expr '^' expr         # power
        | expr op=('*'|'/') expr        # muldiv
        | expr op=('+'|'-') expr    # addsub
        | INT                      #int
        | FLOAT                    # float
        | BOOL                 # bool
        | '(' expr ')'               # parens
        ;


