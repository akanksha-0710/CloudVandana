function reverseWordsInSentence(sentence) {
    const words = sentence.split(' '); // Split the sentence into words
    const reversedWords = [];

    for (const word of words) {
        const reversedWord = reverseWord(word);
        reversedWords.push(reversedWord);
    }

    const reversedSentence = reversedWords.join(' '); // Join the reversed words
    return reversedSentence;
}

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);

console.log(reversedSentence);
