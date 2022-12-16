/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Moscow.QA.libEncrypt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AESEncrypt {

    /**
     * Mã hóa chuỗi bằng chuẩn mã hóa AES (The Advanced Encryption Standard)
     *
     * @param input chuỗi cần mã hóa.
     * @param secretKey khóa bí mật dùng để giải mã.
     * @return Trả về chuỗi đã được mã hóa.
     */
    public static String enCrypt(String input, String secretKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] byteEncrypted = cipher.doFinal(input.getBytes());
        String encrypted = Base64.getEncoder().encodeToString(byteEncrypted);
        return encrypted;

    }

    /**
     * Giải mã mã hóa AES (The Advanced Encryption Standard)
     *
     * @param input chuỗi đã được mã hóa.
     * @param secretKey khóa bí mật dùng để giải mã.
     * @return Trả về chuỗi đã được giải mã.
     */
    public static String deCrypt(String input, String secretKey) throws NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        SecretKeySpec skeySpec = new SecretKeySpec(secretKey.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        byte[] temp = Base64.getDecoder().decode(input);
        cipher.init(Cipher.DECRYPT_MODE, skeySpec);
        byte[] byteDecrypted = cipher.doFinal(temp);
        String decrypted = new String(byteDecrypted);
        return decrypted;
    }
}
