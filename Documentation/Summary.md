## Отчёт по итогам автоматизации

Проведено автоматизированное тестирование веб-сервиса покупки туров для обоих вариантов покупки:
* Оплата по дебетовой карте 
* Оплата по кредитной карте

#### Было запланировано: 
- реализовать набор UI-тестов (как позитивных, так и негативных) по предоставленным данным (валидная и невалидная карты);
- проверить поддержку заявленных СУБД (MySQL, PostgreSQL);
- использовать перечень инструментов.

#### Было сделано:
- реализован набор UI-тестов (60 тест-кейсов);
- подтверждена заявленная поддержка СУБД (MySQL, PostgreSQL);
- в процессе работы использовались все запланированные инструменты кроме Appveyor.

#### Сработавшие риски:
- трудности с поиском необходимых CSS-селекторов для UI тестирования;
- трудности с подключением баз данных и SUT к Docker;
- наличие различных багов в тестируемом приложении;
- сложности, связанные с необходимостью работы сразу с двумя БД - MySQL и PostgreSQL;
- проблемы с запуском SUT и подготовкой тестового окружения в связи с использованием большого перечня трудоёмких
инструментов;
- Возникли проблемы с генерацией отчёта с помощью AllureReport;
- Отсутствие необходимой документации привело к дополнительным временным затратам.

#### Общий итог по времени:
- Планирование - запланировано 10 часов, фактически - 16 (дополнительное время затрачено на расширение тестового покрытия);
- Автоматизация - запланировано 38 часов, фактически - 48 (дополнительное время затрачено на решение проблем, описанных в рисках + затрачено время на составление тестов и класса с SQL-запросами);
- Отчётные документы по итогам тестирования - запланировано 8 часов, фактически - 5;
- Отчётные документы по итогам автоматизации - запланировано 10 часов, фактически - 5;
- Запланированное время на риски - 8 часов.

Итого запланировано: С учётом возможных рисков и сложностей - **74 часа**.

Итого затрачено: **74 часа**.

Автоматизация не была проведена в заявленные сроки, но была проведена без превышения заявленных в [плане](https://github.com/MVGIC/QA-Diploma/blob/master/Documentation/Plan.md) временных затрат в 74 часа.

Ключевая задача - автоматизировать сценарии (как позитивные, так и негативные) покупки тура - достигнута!