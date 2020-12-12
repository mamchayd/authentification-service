package ma.enset.security;

public class JWTUtils {
    public static final String SECRET = "ghhjhjihiufeETTUHJ10mmm";
    public static final String AUTH_HEADER = "Authorization";
    public static final String PREFIX = "Bearer ";
    public static final long EXPRIRE_ACCESS_TOKEN = 2*60*1000;
    public static final long EXPRIRE_REFRESH_TOKEN = 15*60*1000;
}