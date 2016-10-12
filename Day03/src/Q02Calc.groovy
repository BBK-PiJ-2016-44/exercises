double p = 0.0
double q = 0.0
double answer = 0.0

String str

//get inputs
println "Please provide two numbers"
print "First number: "
str = System.console().readLine()
p = Double.parseDouble(str)
println "Entered: " + p

print "Second number: "
str = System.console().readLine()
q = Double.parseDouble(str)
println "Entered: " + q

 System.out.print("What do you want to do?  a = add, s = subtract, m = multiply, d = divide: ")
 String str = System.console().readLine()
 System.out.println("Entered: " + str)

 // calculate
 if (str.equals("+")) {
    answer = p + q
 } else {
    if (str.equals("-")) {
            answer = p - q
    } else {
        if (str.equals("x")) {
            answer = p * q
        } else {
            if (str.equals("/")) {
                answer = p / q
            } else {
                println "Invalid operator " + str
            }

//output
System.out.println("The answer is: " + answer)