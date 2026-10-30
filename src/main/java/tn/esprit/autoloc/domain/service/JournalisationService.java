package tn.esprit.autoloc.domain.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JournalisationService {
    public void info(String message) { log.info(message);}
    public void erreur(String message, Throwable t) { log.error(message,t);}
}
