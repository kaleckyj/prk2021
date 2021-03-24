# U1 Vlastní jazyk

## Datové typy
* int: 32bit
* float: 32bit

## Operace a operátory
* sčítání, odčítání: +, -
* násobení, dělení: *, /
* modulo: %
* závorky: (, )
* inkrement, dekrement: ++, --

## Priorita operátorů
1. ++, --
3. *, /, %
4. +, -

## Příklad deklarace a inicializace proměnných
int number = 8;
float ones = 1,111;

## Funkce
* absolutní hodnota: abs(a)
* zaokrouhlování: ceil(a), floor(a), round(a)

## Správný výraz
(a * b) / abs(a++) + ceil(round(a--) % floor(b))

# U2 Gramatika
digit ::= '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'  
number ::= '0' | digit  
integer ::= '0' | (number)*  
float ::= 'integer' ',' 'integer'  
  
add_op ::= '+' | '-'  
mul_op ::= '*' | '/'  
mod_op ::= '%'  
operators ::= add_op | mul_op | mod_op;  
ceil ::= "ceil(" float ")" ;  
round ::= "round(" float ")" ;  
floor ::= "floor(" float ")" ;  
abs ::= "abs(" float ")" | "abs(" integer ")";  

expr ::= (expr operators expr) | ceil | round | floor | abs  

# U3 Lexikální analyzátor
* TODO

# U4 Syntaktický analyzátor
* TODO

# U5: Finále
* TODO
