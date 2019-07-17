// **** What is a Template Literal? ****
// A "template" is preset format.
// A "literal" is a value written exactly as it's meant to be interpreted.

//  **** In JavaScript terminology: ****
//  A template literal is a way to concatenate strings while allowing embedded expressions and improving readability.

// **** 1st Code Snippet ****

var p = {
    name: 'Alfred',
    nn: 'Alfy'
};

// String Concatenation
console.log('Hi, I\'m ' + p.name + '! Call me "' + p.nn + '".');

// Template Literal
console.log(`Hi, I'm ${p.name}! Call me "${p.nn}".`);

// **** 2nd Code Snippet ****

// String Concatenation
console.log('Three plus six is ' + (3 + 6) + '.');

// Template Literal
console.log(`Three plus six is ${3 + 6}.`);