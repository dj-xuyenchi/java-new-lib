/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Istanbul.QA.libPersonalForImage;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author DJXuyenChi
 */
public class ImageMix {

    /**
     * Chỉnh lại kích thước của ảnh.
     *
     * @param input đầu vào là ảnh cần thay đổi kích thước.
     * @param width chiều dài mới.
     * @param height chiều cao mới.
     * @return Trả về ảnh có kích thước mới.
     */
    public static Image resizeImage(Image input, int width, int height) {
        return input.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    /**
     * Tạo ảnh từ mảng byte.
     *
     * @param input đầu vào là 1 mảng byte.
     * @return Trả về ảnh được chuyển đổi từ mảng byte.
     */
    public static Image createImageFromByteArray(byte[] input) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(input);
        BufferedImage bi = ImageIO.read(bais);
        return bi.getScaledInstance(bi.getWidth(), bi.getHeight(), Image.SCALE_SMOOTH);
    }

    /**
     * Chuyển ảnh thành 1 mảng byte.
     *
     * @param input đầu vào là 1 mảng byte.
     * @param type đầu vào là String định dạng ảnh gốc JPG,PNG,....
     * @return Trả về mảng byte được chuyển đổi từ ảnh.
     */
    public static byte[] image2ByteArray(Image input, String type) {
        BufferedImage bi = new BufferedImage(input.getWidth(null), input.getHeight(null), BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = bi.createGraphics();
        g2.drawImage(input, 0, 0, null);
        g2.dispose();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bi, type, baos);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return baos.toByteArray();
    }

}
