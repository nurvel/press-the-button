### DevOps-stuff

Stuff

- Frontend:
    - React, ts
    - Redux, Rxjs
- Backend:
    - Spring (Reactive)
    - Cache: Redis
    - OpenApi
- MysQL
    - Version Control: Flyway
- CI/CD
    - GitHub Actions / CircleCI / Jenkins
    - Docker
    - Kubernetes, Docker
    - Loadbalacer?
- Monitoring
    - Spring Actuator
    - Jhipster?
- Tests:
    - Unit: Jest, JUnit
    - E2E
    - UI: Selenium, RobotFramework
    - Load

###

https://medium.com/@shakyShane/lets-talk-about-docker-artifacts-27454560384f
docker run -p 8080:80 velipekkanurmi/press-the-button-frontend-ui

### Kubernetes

create Deployment & Service
kubectl apply -f frontend-ui.yaml




```
$ kubectl get service
NAME                       TYPE        CLUSTER-IP     EXTERNAL-IP   PORT(S)    AGE
kubernetes                 ClusterIP   10.96.0.1      <none>        443/TCP    25h
press-the-button-service   ClusterIP   10.99.13.176   <none>        3000/TCP   88s
```

```
$ kubectl describe service press-the-button-service
Name:              press-the-button-service
Namespace:         default
Labels:            <none>
Annotations:       kubectl.kubernetes.io/last-applied-configuration:
                     {"apiVersion":"v1","kind":"Service","metadata":{"annotations":{},"name":"press-the-button-service","namespace":"default"},"spec":{"ports":...
Selector:          app=frontend-ui
Type:              ClusterIP
IP:                10.99.13.176
Port:              <unset>  3000/TCP
TargetPort:        80/TCP
Endpoints:         172.17.0.7:80 # HOX application listening port
Session Affinity:  None
Events:            <none>
```

```
$ kubectl get all
NAME                                               READY   STATUS    RESTARTS   AGE
pod/press-the-button-deployment-77bdb8c7f9-xtkgd   1/1     Running   0          4m35s

NAME                               TYPE        CLUSTER-IP     EXTERNAL-IP   PORT(S)    AGE
service/kubernetes                 ClusterIP   10.96.0.1      <none>        443/TCP    25h
service/press-the-button-service   ClusterIP   10.99.13.176   <none>        3000/TCP   4m17s

NAME                                          READY   UP-TO-DATE   AVAILABLE   AGE
deployment.apps/press-the-button-deployment   1/1     1            1           15m

NAME                                                     DESIRED   CURRENT   READY   AGE
replicaset.apps/press-the-button-deployment-77bdb8c7f9   1         1         1       4m35s
replicaset.apps/press-the-button-deployment-78557798c7   0         0         0       15m
```


```
minikube service <SERVICE NAME> --url
```