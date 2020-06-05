import io.jsonwebtoken.*;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public class JWT {

    public static String krijojwt(String argumenti) throws Exception {
        String jwt = "";
        try {
            Instant now = Instant.now();
            jwt = Jwts.builder()
                    .setSubject(argumenti)
                    .setAudience("DataSecurity Project")
                    .setIssuedAt(Date.from(now))
                    .setExpiration(Date.from(now.plus(20, ChronoUnit.MINUTES)))
                    .signWith(Key.returnPrivateKey(argumenti))
                    .compact();
        } catch (Exception e) {
            System.out.println("Error: Gjate krijimit te tokenit mungon celesi privat '" + argumenti + "'");
        }
        return jwt;
    }

    public static void verifikojwt(String jwt) throws Exception {

        Jws<Claims> result = null;

        try {
            result = Jwts.parser()
                    .setSigningKey(Key.returnPublicKey(kthesubject(jwt)))
                    .parseClaimsJws(jwt);

            // System.out.println(result);  mi shfaq headerin,body,signaturen e JWT
            System.out.println("User: " + result.getBody().getSubject());
            System.out.println("Valid: Po");
            System.out.println("Skadimi: " + result.getBody().getExpiration());

        } catch (Exception e) {
//            System.out.println("User: " + kthesubject(jwt));
            System.out.println("Tokeni: Nuk eshte valid");
        }
    }

    public static String kthesubject(String jwt) throws Exception {
        int i = jwt.lastIndexOf('.');
        String withoutSignature = jwt.substring(0, i + 1);
        Jwt<Header, Claims> untrusted = Jwts.parser().parseClaimsJwt(withoutSignature);
        String subject = untrusted.getBody().getSubject();
        return subject;
    }

}

