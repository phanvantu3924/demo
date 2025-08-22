# --- Build stage (tuỳ chọn tối ưu) ---
# Bạn đang build jar ngoài host bằng Maven rồi, nên có thể bỏ stage này.
# Ở đây dùng kiểu đơn giản: chỉ chạy jar.

FROM eclipse-temurin:21-jre
WORKDIR /app

# COPY đúng tên jar đã build (sửa nếu artifactId/version khác)
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
