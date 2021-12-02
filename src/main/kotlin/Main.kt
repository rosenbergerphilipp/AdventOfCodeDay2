import java.io.File
import java.nio.file.Paths

fun main(args: Array<String>) {
    part1()
    part2()
}
    var horizontalPosition = 0
    var depthPosition = 0
    var aim =0
    fun part2(){
        for(line:String in readLines( System.getProperty("user.dir")+"/src/main/resources/input.txt")){
            var lineStrings = line.split(" ")
            if(lineStrings[0].equals("up")){
                aim-=Integer.parseInt(lineStrings[1])
            } else if(lineStrings[0].equals("down")){
                aim+=Integer.parseInt(lineStrings[1])
            } else if(lineStrings[0].equals("forward")){
                horizontalPosition+=Integer.parseInt(lineStrings[1])
                depthPosition += aim * Integer.parseInt(lineStrings[1])
            }
        }
        println("HorizontalPosition: "+horizontalPosition)
        println("DepthPositioN: "+depthPosition)
        println(horizontalPosition*depthPosition)
    }
    fun part1(){
        for(line:String in readLines( System.getProperty("user.dir")+"/src/main/resources/input.txt")){
           var lineStrings = line.split(" ")
            if(lineStrings[0]=="forward"){
                changeHorizontalDirection(Integer.parseInt(lineStrings[1]))
            } else if(lineStrings[0].equals("up")){
                changeDepth(Integer.parseInt(lineStrings[1])*-1)
            } else if(lineStrings[0].equals("down")){
                changeDepth(Integer.parseInt(lineStrings[1]))
            }
        }
        println("HorizontalPosition: "+horizontalPosition)
        println("DepthPositioN: "+depthPosition)
        println(horizontalPosition*depthPosition)
    }

    private fun changeDepth(value: Int) {
        depthPosition+=value;
    }

    fun changeHorizontalDirection(value:Int){
        horizontalPosition+= value;
    }


fun readLines(filePath: String):List<String>{
    return File(filePath).readLines();
}
