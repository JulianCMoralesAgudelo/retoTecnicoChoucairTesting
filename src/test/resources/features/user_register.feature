#Autor Julian Morales
@stories
Feature: User register in uTest page

  @scenario1
  Scenario: User successful registered
    Given Julian registers on the page
    When enter his dates into the module
      | strName       | strLastName     | strEmail               | strBirthMonth | strBirthDay | strBirthYear | strCity | strZip | strCountry | strMobile | strModel  | strOS    | strComputer | strVersion | strLanguage | strPassword  |
      | Julián Camilo | Morales Agudelo | sjca_xhxgx4@tijux.com | November      | 10          | 1983         | Bello   | 051054 | Colombia   | Apple     | iPhone XR | iOS 14.2 | Linux       | Debian     | Spanish     | eaF13cea565d |
    Then should see the welcome message
      | strLastText    |
      | Complete Setup |


