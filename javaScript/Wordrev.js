const str = 'Hi cloud vandhana this is my assignment';
const reverseSentence = str => {
   const arr = str.split(" ");// here i am using split to split an string to sub strings 
   const reversed = arr.map(el => {
      return el.split('').reverse().join("");// here i am using split.reverse to reverse the words which were splitted in previous step 
   });// using join to join the splitted and reversed elements.
   return reversed.join(" ");
};
console.log(reverseSentence(str));