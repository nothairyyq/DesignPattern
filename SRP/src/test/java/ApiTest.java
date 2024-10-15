import com.priska.VideoUserService;
import com.priska.design.IVideoUserService;
import com.priska.design.imple.GuestVideoUserService;

/**
 * @program: IntelliJ IDEA
 * @description: 测试
 * @author: Priska
 * @create: 2024-10-14
 */
public class ApiTest {
    public static void main(String[] args) {
        VideoUserService service = new VideoUserService();
        service.serverGrade("普通用户");
        service.serverGrade("VIP用户");
        service.serverGrade("访客用户");

        IVideoUserService guest = new GuestVideoUserService();
        guest.advertisement();
        guest.definition();
    }
}
