package NIO.demo3;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.*;

/**
 * 设置字符集，解决乱码问题
 */
public class CharsetTest {
    public static void main(String[] args) throws CharacterCodingException {
        CharacterEncodingTest();
    }

    private static void CharacterEncodingTest() throws CharacterCodingException {
        Charset charset = Charset.forName("GBK");
        // 获取GBK编码器
        CharsetEncoder encoder = charset.newEncoder();
        // 获得GBK解码器
        CharsetDecoder decoder = charset.newDecoder();

        CharBuffer charbuffer = CharBuffer.allocate(1024);
        charbuffer.put("绝不敷衍，从不懈怠！");

        charbuffer.flip();
        // 编码,将字符缓冲区转换成字节缓冲区
        ByteBuffer byteBuffer = encoder.encode(charbuffer);
        for (int i = 0; i < 20; i++) {
            System.out.println(byteBuffer.get());
        }

        // 解码，将字节缓冲区转换成字符缓冲区
        byteBuffer.flip();
        CharBuffer charBuffer = decoder.decode(byteBuffer);
        System.out.println(charBuffer.toString());
    }
}
