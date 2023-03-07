# catalog-service
use out-of-the-box integration of Spring Boot with Cloud Native Buildpacks to build springboot docker image : ./gradlew bootBuildImage

deploy a springboot app to kubernetes:
1, install minikube
2, minikube start
3, minikube image load catalog-service:0.0.1-SNAPSHOT
4, kubectl create deployment catalog-service --image=catalog-service;0.0.1-SNAPSHOT
5, verify deployment : kubectl get deployment
6, kubectl get pod
7, expose deployment to a service : kubectl expose deployment catalog-service --name=catalog-service --port=8080
8, verify : kubectl get service catalog-service
9, kubectl port-forward service/catalog-service 8000:8080
10, ctrl + c stop port-forwarding,
    kubectl delete service catalog-service,
    kubectl delete deployment catalog-service
    minikube stop