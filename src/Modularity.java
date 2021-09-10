import java.awt.image.BufferedImage;

public class Modularity {

//    before java 9, JDK was a monolithic architecture
//    we needed the whole JDK for simple apps and had to have unnecessary code
//    with modules, we can use whatever we want and need

//    module contains code and resources
//    like packages, it stays in namespace and has to have unique names
//    com.company.myModule like package
//    each module has module descriptor

//    just add module info file
// if we don't add require java.desktop in the module-info class, then we will get error.
//    but now we don't because we can import that module
    BufferedImage image;

}
