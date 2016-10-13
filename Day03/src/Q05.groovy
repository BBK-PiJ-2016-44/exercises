def cons = new BufferedReader(new InputStreamReader(System.in))

class Point {
    double x
    double y
}

class Rectangle {
    Point upLeft
    Point downRight
}

String str
double topLeftX, topLeftY
double downRightX, downRightY

// Process input for Up Left Corner

print "Up Left X: "
str = cons.readLine()
topLeftX = Double.parseDouble(str)

print "Up Left Y: "
str = cons.readLine()
topLeftY = Double.parseDouble(str)

// Process input for Down Right Corner

print "Down RightX: "
str = cons.readLine()
downRightX = Double.parseDouble(str)
print "Down Right Y: "
str = cons.readLine()
downRightY = Double.parseDouble(str)

// Make the points

Point upLeftCorner = new Point()
upLeftCorner.x = topLeftX
upLeftCorner.y = topLeftY

Point downRightCorner = new Point()
downRightCorner.x = downRightX
downRightCorner.y = downRightY

// Create the rectangle

Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = upLeftCorner
myRectangle.downRight = downRightCorner

// make the calculations

double horizontalLength = myRectangle.downRight.x - myRectangle.upLeft.x
double verticalLength = myRectangle.upLeft.y - myRectangle.downRight.y

// the output to the screen

println "Perimeter: " + 2 * (horizontalLength + verticalLength)
println "Area     : " + horizontalLength * verticalLength
