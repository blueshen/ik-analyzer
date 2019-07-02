package org.wltea.analyzer.query;

import org.apache.lucene.search.Query;
import org.junit.Test;

/**
 * @author shenyanchao
 * @since 2019-07-02 15:37
 */
public class IKQueryExpressionParserTest {

    IKQueryExpressionParser parser = new IKQueryExpressionParser();

    @Test
    public void parseExp() {

        //String ikQueryExp = "newsTitle:'的两款《魔兽世界》插件Bigfoot和月光宝盒'";
        String ikQueryExp =
                "(id='ABcdRf' && date:{'20010101','20110101'} && keyword:'魔兽中国') || (content:'KSHT-KSH-A001-18'  || "
                        + "ulr='www.ik.com') - name:'林良益'";
        Query result = parser.parseExp(ikQueryExp, true);
        System.out.println(result);
    }
}