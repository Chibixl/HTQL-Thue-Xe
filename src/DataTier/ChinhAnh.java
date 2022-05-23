package DataTier;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
public class ChinhAnh {
    
    
    public static Image setanh(Image anh,int ChieuDai, int ChieuRong ){
        Image chinhkichthuoc = anh.getScaledInstance(ChieuDai, ChieuRong, Image.SCALE_SMOOTH);
        return chinhkichthuoc;
    }
    
    public static byte[] ChuyenAnh(Image img, String type) throws IOException{
        BufferedImage bimage= new BufferedImage(img.getWidth(null),img.getHeight(null),BufferedImage.TYPE_INT_BGR);
        Graphics2D g =bimage.createGraphics();
        g.drawImage(img, 0,0,null);
        g.dispose();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(bimage,type,baos);
        byte[] imgByte =baos.toByteArray();
        return imgByte;
        
        
    }
    
    
    public static Image DuaImage(byte[] data) {
        try {
            ByteArrayInputStream bis= new ByteArrayInputStream(data);
            BufferedImage bimg2 =ImageIO.read(bis);
            Image img= bimg2.getScaledInstance(bimg2.getWidth(),bimg2.getHeight(),Image.SCALE_SMOOTH);
            return img;
            } catch (Exception e) {
                return null;
            }
        
    }
    
    
}
