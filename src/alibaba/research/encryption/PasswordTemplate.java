package alibaba.research.encryption;

/**
 * @program: Java workspace
 * @description: 加解密模板
 * @author: Typhoon
 * @create: 2020-02-11 12:25
 * 谁终将声震人间，必长久深自缄默；谁终将点燃闪电，必长久如云漂泊。
 **/
public abstract class PasswordTemplate {
    /**
     * 用于创建密码的模板
     */
    public abstract void cryptographicparadigm();

    /**
     *加密操作
     * @param string 传入需要加密的数据
     * @return 加密后的密文
     */
    public abstract StringBuilder encryption(String string);

    /**
     * 解密操作
     * @param string 需要解密的密文
     * @return 解密后的内容
     */
    public abstract StringBuilder decrypt(String string);
}
