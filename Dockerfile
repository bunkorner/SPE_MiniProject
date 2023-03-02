FROM openjdk:11
COPY ./target/SPE_Mini_Calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_Mini_Calc-1.0-SNAPSHOT.jar"]