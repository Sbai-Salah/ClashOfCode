/*
----------------------- input --------
Hello, code.
>>>

Hello, code.
<

back and forth?
>><<><
------------------ output -------------
de.Hello, co

ello, code.H

back and forth?

*/

let text = readline();
const moves = readline().split("");

function shiftString(text, moves){
    let shiftedText = text;
    for(const move of moves){
        if(move === "<"){
            shiftedText = shiftedText.slice(1) + shiftedText[0];
        }else if(move === ">"){
            shiftedText = shiftedText.slice(-1) + shiftedText.slice(0, -1);
        }
    }
    return shiftedText;
}

console.log(shiftString(text, moves));
// example : LAUGHTALE < : AUGHTALE + L //// LAUGHTALE > : E + LAUGHTAL

// shiftedText.slice(1) : cuts the first char in the text --> AUGHTALE
// shiftedText.slice(-1) : cuts the last char in the text --> E
// shiftedText.slice(0, -1) : cuts from the first char to the before-last char --> LAUGHTAL
  
