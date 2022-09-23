package io.navan.tourofheroes.services;


import io.navan.tourofheroes.entities.Hero;
import io.navan.tourofheroes.repositories.HeroRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    public Iterable<Hero> getHeroes() {
        return heroRepository.findAll();
    }

    public Optional<Hero> getHeroById(final Long id) {
        return heroRepository.findById(id);
    }

    public void deleteHero(final Long id) {
        heroRepository.deleteById(id);
    }

    public Hero createNewHero(Hero hero) {
        Hero savedHero = heroRepository.save(hero);
        return savedHero;
    }

    public Hero updateHero(Long id, Hero hero) {
        return heroRepository.save(hero);
    }
}
