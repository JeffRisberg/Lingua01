package com.company;

import com.github.pemistahl.lingua.api.Language;
import com.github.pemistahl.lingua.api.LanguageDetector;
import com.github.pemistahl.lingua.api.LanguageDetectorBuilder;
import lombok.extern.slf4j.Slf4j;

import static com.github.pemistahl.lingua.api.Language.*;

@Slf4j
public class Main {
  public static void main(String[] args) {

    final LanguageDetector detector =
        LanguageDetectorBuilder.fromLanguages(GERMAN, ENGLISH, FRENCH).build();

    Language x = detector.detectLanguageOf("hello there");

    log.info(x.toString());
    System.out.println(x.toString());
  }
}
