@LoginProfile
Feature: Тестируем страницу авторизации
  Тестируем сообщения об ошибках при неудачной авторизации

  Scenario Outline: Неудачная авторизация
    Given Я нахожусь на домашней странице
    Then  Я нажимаю ссылку signIn
    When  Ввожу логин '<логин>'
    And   Ввожу пароль '<пароль>'
    And   нажимаю отправить
    Then  должен увидеть сообщение об ошибке '<сообщение>'

    Examples:
      | логин                    | пароль        | сообщение                   |
      | yavoric@rambler.ru.com   |123            |Invalid password.            |
      | 123                      |123qwerty      |Invalid email address.       |