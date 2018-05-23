package proxypattern;

public class Proxypattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Image image = new ProxyImage("test_10mb.jpg");
      image.display(); 
    }
    
}
