package unk.HackBack.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unk.HackBack.Entities.Profile;
import unk.HackBack.Repos.ProfileRepository;

@RestController
@RequestMapping("api/profiles")
public class ProfileController {

    private ProfileRepository profileRepository;

    public ProfileController(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    @GetMapping
    public Iterable<Profile> getProfile() {

        Iterable<Profile> profiles = profileRepository.findAll();

        return profiles;
    }
}
