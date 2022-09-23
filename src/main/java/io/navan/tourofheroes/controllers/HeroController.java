package io.navan.tourofheroes.controllers;

import io.navan.tourofheroes.entities.Hero;
import io.navan.tourofheroes.services.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value ="heroes")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Hero> getHeroes() {
        System.out.println("Test");
        return heroService.getHeroes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Hero> getHeroesById(@PathVariable Long id) {
        return heroService.getHeroById(id);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Hero createNewHero(@RequestBody Hero hero) {
        return heroService.createNewHero(hero);
    }

    @PutMapping({"/edit/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Hero updateHero(@PathVariable Long id, @RequestBody Hero hero) {
        return heroService.updateHero(id, hero);
    }

    @DeleteMapping({"/delete/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public void deleteHero(@PathVariable Long id) {
        heroService.deleteHero(id);
    }
}
