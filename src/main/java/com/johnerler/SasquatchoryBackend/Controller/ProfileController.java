package com.johnerler.SasquatchoryBackend.Controller;

import com.johnerler.SasquatchoryBackend.model.Profile;
import com.johnerler.SasquatchoryBackend.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    ProfileRepository repo;

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Profile> getAllProfiles() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Profile getProfileById(@PathVariable int id) {
        Optional<Profile> returnVal = repo.findById(id);
        return returnVal.orElse(null);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Profile addProfile(@RequestBody Profile profile) {
        return repo.save(profile);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProfile(@RequestBody Profile profile) {
        repo.save(profile);
    }

    @DeleteMapping("/{id")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProfile(@PathVariable int id) {
        repo.deleteById(id);
    }
}
