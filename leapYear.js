/*

Your program must output whether the year given on the standard input is a leap year (true) or not (false).
To know if a year is a leap year, follow this guide:

1 If the year is divisible by 4, go to step 2, otherwise go to step 5.
2 If the year is divisible by 100, go to step 3. Otherwise, go to step 4.
3 If the year is divisible by 400, go to step 4. Otherwise, go to step 5.
4 The year is a leap year (it has 366 days).
5 The year is not a leap year (it has 365 days).

*/


const year = parseInt(readline());

const isLeapYear = (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);

console.log(isLeapYear);