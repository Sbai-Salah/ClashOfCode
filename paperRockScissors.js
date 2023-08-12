/*

You must output who wins or DRAW

If you are not familiar:
Rock paper scissors is a hand game usually played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are "rock" (a closed fist), "paper" (a flat hand), and "scissors" (a fist with the index finger and middle finger extended, forming a V).
It has only two possible outcomes: a draw, or a win for one player and a loss for the other.
- A player who decides to play rock will beat another player who has chosen scissors ("rock crushes scissors") but will lose to one who has played paper ("paper covers rock")
- A play of paper will lose to a play of scissors ("scissors cuts paper")
- If both players choose the same shape, the game is tied

Input               |         Output
____________________|____________________
ROCK SCISSORS       |         PLAYER1
PAPER PAPER         |         DRAW
*/


var inputs = readline().split(' ');
const call1 = inputs[0];
const call2 = inputs[1];

function determineWinner(player1Choice, player2Choice) {
    if (player1Choice === player2Choice) {
        return "DRAW";
    } else if (
        (player1Choice === "ROCK" && player2Choice === "SCISSORS") ||
        (player1Choice === "SCISSORS" && player2Choice === "PAPER") ||
        (player1Choice === "PAPER" && player2Choice === "ROCK")
    ) {
        return "PLAYER1";
    } else {
        return "PLAYER2";
    }
}


const result = determineWinner(call1, call2);
console.log(result);

/////////// ONE LINER  ///////////////

console.log(call1 === call2 ? "DRAW" : (call1 + call2 === "ROCKSCISSORS" || call1 + call2 === "SCISSORSPAPER" || call1 + call2 === "PAPERROCK" ? "PLAYER1" : "PLAYER2"));
