# SimpleCloudApp
REST-сервис, предоставляющий интерфейс для работы с файлами.

## Описание
При создании приложения были использованы:
- Spring Boot
- Spring Data JPA
- В качестве базы данных - MySQL
- Сборщик Maven
- Для запуска используется Docker compose
- Логирование с помощью Slf4j и logback
- JUnit, Mockito и MockMvc для тестирования
- Liquibase для миграций

## Изменение уровня логирования
По эндпоинту `localhost:8080/actuator/loggers/ru.netology.diploma` возможно изменить уровень логирования.
Для этого необходимо выполнить POST запрос, в теле передать ``{
"configuredLevel": "УРОВЕНЬ"
}``, например
``{
"configuredLevel": "DEBUG"
}``
