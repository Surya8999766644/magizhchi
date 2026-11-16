

const readline = require('readline');
const rl = readline.createInterface({ input: process.stdin, output: process.stdout });

const addTwoNumbers = (a, b, callback) => callback(a + b);

const checkEvenOdd = function(num) {
    return num % 2 === 0 ? `${num} is Even` : `${num} is Odd`;
};

const multiplyNumbers = (a, b, callback) => callback(a * b);

function showMenu() {
    console.log("\n--- MENU ---");
    console.log("1. Add Two Numbers");
    console.log("2. Check Even or Odd");
    console.log("3. Multiply Two Numbers and Check Result");
    console.log("4. Exit");
    
    rl.question("Choose an option (1-4): ", (choice) => {
        switch (choice.trim()) {
            case '1':
                rl.question("Enter first number: ", (n1) => {
                    rl.question("Enter second number: ", (n2) => {
                        addTwoNumbers(Number(n1), Number(n2), (sum) => {
                            console.log(`Sum: ${sum}`);
                            showMenu();
                        });
                    });
                });
                break;
                
            case '2':
                rl.question("Enter a number: ", (num) => {
                    console.log(checkEvenOdd(Number(num)));
                    showMenu();
                });
                break;
                
            case '3':
                rl.question("Enter first number: ", (n1) => {
                    rl.question("Enter second number: ", (n2) => {
                        multiplyNumbers(Number(n1), Number(n2), function(product) {
                            console.log(`Product: ${product}`);
                            console.log(`Is greater than 100? ${product > 100}`);
                            showMenu();
                        });
                    });
                });
                break;
                
            case '4':
                console.log("Exiting program. Goodbye!");
                rl.close();
                break;
                
            default:
                console.log("Invalid option. Please try again.");
                showMenu();
        }
    });
}

showMenu();



//2 queation//
// 1. Print “Hello World” every 2 seconds
function printHello() {
    console.log("Hello World");
}
setInterval(printHello, 2000);

// 2. Display numbers from 1 to 10, one number every 1 second
let count = 1;
function printNumbers() {
    console.log(count);
    if (count === 10) {
        clearInterval(timer);
    }
    count++;
}
const timer = setInterval(printNumbers, 1000);

// 3. Display the current time every second
function showTime() {
    console.log(new Date().toLocaleTimeString());
}
setInterval(showTime, 1000);

// 4. Display even numbers continuously with a delay of 2 seconds
let evenNumber = 0;
function printEven() {
    console.log(evenNumber);
    evenNumber += 2;
}
setInterval(printEven, 2000);

// 5. Simulate a countdown timer from 10 to 0
let countdown = 10;
function startCountdown() {
    console.log(countdown);
    if (countdown === 0) {
        console.log("Countdown finished!");
        clearInterval(countdownTimer);
    }
    countdown--;
}
const countdownTimer = setInterval(startCountdown, 1000);

