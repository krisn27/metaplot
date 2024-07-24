class Nokia
{
    private int mic;
    private int cam;
    void setValue(){
        mic=2;
        cam=40;
    }
    void display(){
        System.out.println(mic);
        System.out.println(cam);

    }
}
 class classAndObjects
{
    public static void main(String args[]){
      Nokia nokia=new Nokia();
       nokia.setValue();
       nokia.display();
    }
}