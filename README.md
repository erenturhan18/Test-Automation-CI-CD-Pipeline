# 🚀 Test Automation CI/CD Pipeline

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-FF7F00?style=for-the-badge&logo=testng&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white)

[![Smoke Test & Deployment Validation](https://github.com/erenturhan18/Test-Automation-CI-CD-Pipeline/actions/workflows/maven.yml/badge.svg?branch=master)](https://github.com/erenturhan18/Test-Automation-CI-CD-Pipeline/actions/workflows/maven.yml)

Bu proje, yazılım test süreçlerini otomatiğe bağlayarak **Sürekli Test (Continuous Testing)** kültürünü uygulamak için geliştirilmiştir. Selenium WebDriver testlerinin, her kod güncellemesinde **GitHub Actions** üzerinden bulut ortamında (headless) otomatik olarak çalışmasını sağlayan tam teşekküllü bir hattır.

## 🎯 Projenin Öne Çıkan Özellikleri
- **CI/CD Entegrasyonu:** Her `push` ve `pull request` sonrası otomatik test tetikleme.
- **Headless Execution:** Grafik arayüzü olmayan sunucularda (Ubuntu Runner) yüksek performanslı test koşumu.
- **Page Object Model (POM):** Sürdürülebilir, okunabilir ve tekrar kullanılabilir kod mimarisi.
- **Dynamic Configuration:** Farklı ortamlar ve tarayıcılar için esnek yapılandırma desteği.

## 🛠️ Teknik Yığın (Tech Stack)
- **Language:** Java 11
- **Automation:** Selenium WebDriver
- **Test Runner:** TestNG
- **Build Tool:** Maven
- **Pipeline:** GitHub Actions

## 🏗️ CI/CD İş Akışı (Workflow)
Proje, GitHub Actions üzerinde tanımlanan şu adımları takip eder:
1. **Environment Setup:** Java JDK 11 kurulumu ve ortam değişkenlerinin ayarlanması.
2. **Dependency Management:** Maven üzerinden gerekli tüm kütüphanelerin (Selenium, TestNG vb.) indirilmesi.
3. **Headless Configuration:** Testlerin sunucu tarafında sorunsuz çalışması için `--headless`, `--no-sandbox` ve `--disable-dev-shm-usage` argümanlarının kullanımı.
4. **Test Execution:** `mvn test` komutu ile tüm test suitlerinin koşturulması.

## 💻 Kurulum ve Çalıştırma
Projeyi yerelinizde çalıştırmak için:

```bash
# Repoyu klonlayın
git clone [https://github.com/erenturhan18/Test-Automation-CI-CD-Pipeline.git](https://github.com/erenturhan18/Test-Automation-CI-CD-Pipeline.git)

# Proje dizinine gidin
cd Test-Automation-CI-CD-Pipeline

# Testleri çalıştırın
mvn test
