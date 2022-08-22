package CursorHomeWorks06.MyUuidModule;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UuidService {
    public List<UUID> getUUID(@RequestParam("size") int size) {
        List<UUID> uuidList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            uuidList.add(UUID.randomUUID());
        }
        return uuidList;
    }
}
