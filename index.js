//arrow function
const ab = () => {
    console.log(this.name);
}

ab.call({ name: 'John' }); // undefined because arrow functions do not have their own 'this' 

//normal function
const abc = function() {
    console.log(this.name);
}

abc.call({ name: 'John' }); // John



//fibonacci sequence
function fibonacci(n) {
  let a = 0, b = 1;
  const result = [];

  for (let i = 0; i < n; i++) {
    result.push(a);
    [a, b] = [b, a + b]; // swap and sum
  }

  return result;
}

console.log(fibonacci(10));
// [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]


//character frequency
const sentence = "my name is satish";
const freq = {};

for (const ch of sentence) {
  if (ch !== " ") {              // ignore spaces
    freq[ch] = (freq[ch] || 0) + 1;
  }
}

console.log(freq);

const str = "my name is satish";
const reversedWords = str.split(" ").reverse().join(" ");
console.log(reversedWords);
// Output: "satish is name my"
