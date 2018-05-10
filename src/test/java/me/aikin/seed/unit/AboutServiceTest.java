package me.aikin.seed.unit;

import me.aikin.seed.services.AboutService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AboutServiceTest {
    @InjectMocks
    private AboutService aboutService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void should_return_about_when_call_about() {
        assertEquals("about", aboutService.about());
    }
}
