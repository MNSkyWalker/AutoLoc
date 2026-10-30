package tn.esprit.autoloc.domain.repository;

import org.springframework.stereotype.Component;

public interface StrategieTarification {
     double calculer(double tarifJournalier, int jours);
}

@Component("STANDARD")
class TarificationStandard implements StrategieTarification {
     @Override public double calculer(double tarifJournalier, int jours) {
          return tarifJournalier * jours;
     }
}

@Component("LONGUE_DUREE")
class TarificationLongueDuree implements StrategieTarification {
     @Override public double calculer(double tarifJournalier, int jours) {
          return tarifJournalier * jours * 0.80;   // -20 %
     }

@Component("ENTREPRISE")
public class TarificationEntreprise implements StrategieTarification {
      @Override public double calculer(double tarifJournalier, int jours) {
         return tarifJournalier * jours * 0.85;   // -15 %
          }
     }

}