# task1
## Description of the test task
#### Implement an algorithm that simplify English text. Please see description below:
### 1) Remove "c" from text

    If text contains “ci” and “ce”, change it to “si” and “se”.
    If “ck” then change it to “k”.
    In other case replace “c” with “k”.
    All changes should be made in strong order left-to-right.
    For example:
        Word “success” first of all will be word “sukcess”. Then “suksess”.

### 2) Remove double letter

    If text contains “ee” then replace it by simple “i”.
    If “oo” then change it by “u”.
    In other case any double letter should be changed by one letter.
    For example:
        “ooo” will be “uo”
        “oou” will be “u”
        “iee” will be “i”

### 3) Remove letter “e” in the end of each word

    Remove letter “e” in the end of each word if word length > 1.
    For example:
        “The” will be “Th”.

### 4) Remove articles

    Remove articles “a”, “an” or “the” from text. They should be removed only if they were the words a, an, the in the original text.
    For example:
        Input text: “the table”. After first three steps it will be changed to “th tabl”. After fourth step: “tabl”

Examples:
Input
Output
cacao and coffee
kakao and kofi
success
sukses

### As a plus will be:
Implement test use JUnit or TestNG


