def cons = new BufferedReader(new InputStreamReader(System.in))

//get input text and its length

print "Please write a text: "
String inputText = cons.readLine()
int inputLength = inputText.length()

//print forwards
print inputText

//print backwards

int i = 0
while (i < inputLength) {
    backLetter = inputText.charAt(inputLength - i - 1)
    print backLetter
    i++
}

println()
