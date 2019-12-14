package me.study.algo_5397;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class KeyLoggerTest {

    @DisplayName("키로그 테스트")
    @Test
    public void test() {
        final String str1 = "<<BP<A>>Cd-";
        final String result1 = KeyLogger.translate(str1);
        assertThat(result1).isEqualTo("BAPC");

        final String str2 = "ThIsIsS3Cr3t";
        final String result2 = KeyLogger.translate(str2);
        assertThat(result2).isEqualTo("ThIsIsS3Cr3t");

        final String str3 = "ab<-";
        final String result3 = KeyLogger.translate(str3);
        assertThat(result3).isEqualTo("b");

        final String str4 = "f<->--><-l>>d---u-j><>-<u->xb<<a";
        final String result4 = KeyLogger.translate(str4);
        assertThat(result4).isEqualTo("axb");

        final String str5 = "a><><b";
        final String result5 = KeyLogger.translate(str5);
        assertThat(result5).isEqualTo("ba");

        final String str6 = "j><>-<u->xb<<a";
        final String result6 = KeyLogger.translate(str6);
        assertThat(result6).isEqualTo("axb");


        final String str7 = "f<->--><-l>>d---u-j><>-<u->xb<<axkh<-wk>k>--t--s<b<i<ir>--ey>t>>sx<-yb<>jw<-qaruwy<osnshf><<<-uzz--<";
        final String result7 = KeyLogger.translate(str7);
        assertThat(result7).isEqualTo("axwkieybtsbybqaruwosnuhfywx");
    }
}