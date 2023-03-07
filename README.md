# catalog-service
use out-of-the-box integration of Spring Boot with Cloud Native Buildpacks to build springboot docker image : ./gradlew bootBuildImage

deploy a springboot app to kubernetes:<br/>
1, install minikube<br/>
2, minikube start<br/>
3, minikube image load catalog-service:0.0.1-SNAPSHOT<br/>
4, kubectl create deployment catalog-service --image=catalog-service;0.0.1-SNAPSHOT<br/>
5, verify deployment : kubectl get deployment<br/>
6, kubectl get pod<br/>
7, expose deployment to a service : kubectl expose deployment catalog-service --name=catalog-service --port=8080<br/>
8, verify : kubectl get service catalog-service<br/>
9, kubectl port-forward service/catalog-service 8000:8080<br/>
10, ctrl + c stop port-forwarding,<br/>
    kubectl delete service catalog-service,<br/>
    kubectl delete deployment catalog-service<br/>
    minikube stop<br/>
