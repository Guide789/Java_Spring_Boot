package monsterservice.service;

import monsterservice.model.Monster;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class MonsterService {
    public Monster postCreateMonsterService(
            Monster monster
    ) {
        return monster;
    }

    public List<Monster> getAllMonsterService() {
        Monster monster = new Monster();
        monster.setId(1);
        return Collections.singletonList(monster);
    }

    public Monster getInfomation(Integer id) {
        Monster monster = new Monster();
        monster.setId(id);
        return monster;
    }

    public Monster updateMonsterByService(
            Monster monster) {
        return monster;
    }

    public boolean deleteMonsterService(Integer id) {
        return id > 0;
    }

    public Monster attackMonsterService(Integer id, Integer health) {
        Monster monster = new Monster();
        monster.setId(id);
        monster.setHealth(health);
        return monster;
    }
}
