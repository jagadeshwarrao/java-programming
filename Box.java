class Box{
    int height, width, length, volume;
}

public class Main{
    public static void main(String[] args){
        Box myBox_1 = new Box();
        myBox_1.height = 6;
        myBox_1.width = 4;
        myBox_1.length = 7;
        myBox_1.volume = myBox_1.height*myBox_1.width*myBox_1.length;
        Box myBox_2=new Box();
myBox_2.height=myBox_1.height+2;
myBox_2.width=myBox_1.width+2;
myBox_2.length=myBox_1.length+2;
myBox_2.volume=myBox_2.height*myBox_2.width*myBox_2.length;

        //missing code goes here
        System.out.println("Box #1");
        System.out.println("Height: "+myBox_1.height+", Width: "+myBox_1.width+", Length: "+myBox_1.length+". Volume: "+myBox_1.volume);
        System.out.println("Box #2");
        System.out.println("Height: "+myBox_2.height+", Width: "+myBox_2.width+", Length: "+myBox_2.length+". Volume: "+myBox_2.volume);
    }
}
