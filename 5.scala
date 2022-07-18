object main extends App{
    def easyPace(d:Int):Int = 8*d;
    def tempoPace(d:Int):Int = 7*d;
    def totalTime(easy:Int, tempo:Int)=easyPace(easy)+tempoPace(tempo);

    println("Total running time for the scenario: "+totalTime(4,3));
}