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
number ::= '0' | [1-9]   
integer ::= '0' | (number)+  
float ::= integer ',' integer  
var ::= float | integer  

name ::= [a-z]+ | [A-Z]+  
int_decl ::= "int " name " = " integer  
float_decl ::= "float " name " = " float  
decl ::= int_decl | float_decl  
  
add_op ::= '+' | '-'  
mul_op ::= '*' | '/'  
mod_op ::= '%'  
inc_op ::= "++" | "--"  
bin_ops ::= add_op | mul_op | mod_op   
ceil ::= "ceil(" float ")"  
round ::= "round(" float ")"  
floor ::= "floor(" float ")"  
abs ::= "abs(" var ")"
  
expr ::= (declaration | (expr bin_ops expr) | (expr inc_op) | ceil | round | floor | abs )  
